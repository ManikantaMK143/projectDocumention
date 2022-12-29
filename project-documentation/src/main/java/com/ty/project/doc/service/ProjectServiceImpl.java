package com.ty.project.doc.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ty.project.doc.entity.dto.Projects;
import com.ty.project.doc.repository.dao.ProjectRepository;

@Service
public class ProjectServiceImpl implements ProjectService {

	private static final Logger log = LoggerFactory.getLogger(ProjectServiceImpl.class);

	@Autowired
	ProjectRepository projectRepository;

	@Override
	public Projects saveData(Projects projects) {
		try {
			log.info("Calling project repository to save the data ");
			Projects save = projectRepository.save(projects);
			if (save != null) {
				return save;
			}

		} catch (Exception e) {
			log.error("Exception occured due to", e);
		}
		return null;
	}

	@Override
	public List<Projects> getAllData() {

		return projectRepository.findAll();
	}

	@Override
	public List<Projects> getData(String profusionUserId) {
		try {
			log.info("Fetch the project data against::" + profusionUserId);
			if (profusionUserId != null) {
				List<Projects> findByProfusionUserId = projectRepository.findByProfusionUserId(profusionUserId);
				if (findByProfusionUserId != null && findByProfusionUserId.size() > 0) {
					return findByProfusionUserId;
				}

			} else {
				throw new Exception("profusionUserId is null::" + profusionUserId);
			}
		} catch (Exception e) {
			log.error("Exception occured due to", e);
		}
		return null;
	}

	@Override
	public void deleteByID(Integer proId) {
		try {
			log.info("Deleteing the project details against the Project_ID::" + proId);
			if (proId != null && proId > 0) {
				projectRepository.deleteById(proId);
			} else {
				throw new NullPointerException("Null values not acceptable");
			}
		} catch (Exception e) {
			log.error("Exception ocurred due to ", e);
		}

	}

	@Override
	public Projects updateData(Projects projects) {
		try {
			log.info("Fetching the data against project id :: " + projects.getProId());
			Projects projects2 = projectRepository.findById(projects.getProId()).get();
			if (projects2 != null) {
				log.info("Updating the project data against the project id::" + projects.getProId());

				BeanUtils.copyProperties(projects, projects2);
				Projects save = projectRepository.save(projects2);
				if (save != null) {
					return save;

				}

			} else {
				throw new NullPointerException("Null values not acceptable");
			}

		} catch (Exception e) {
			log.error("Exception occured due to", e);
		}
		return null;
	}

}
