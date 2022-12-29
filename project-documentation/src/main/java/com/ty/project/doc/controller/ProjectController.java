package com.ty.project.doc.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ty.project.doc.entity.dto.Projects;
import com.ty.project.doc.response.dto.AppResponse;
import com.ty.project.doc.service.ProjectService;

@RestController
public class ProjectController {

	private static final Logger log = LoggerFactory.getLogger(ProjectController.class);

	@Autowired
	ProjectService projectService;

	@PostMapping("/save-data")
	public ResponseEntity<AppResponse> createData(@RequestBody Projects projects) {
		try {
			log.info("Calling project service to save the data");
			Projects saveData = projectService.saveData(projects);
			if (saveData != null) {
				return new ResponseEntity<AppResponse>(new AppResponse("M200", "Data saved successfully", saveData),
						HttpStatus.CREATED);
			}

		} catch (Exception e) {
			log.error("Exception occured due to", e);
		}
		return new ResponseEntity<AppResponse>(new AppResponse("M400", "Failed to save the data", null),
				HttpStatus.BAD_REQUEST);

	}

	@GetMapping("/get-project-data")
	public List<Projects> getAllData() {
		return projectService.getAllData();

	}

	@GetMapping("/get-by-id")
	public ResponseEntity<AppResponse> fetchByID(@RequestParam String profusionUserId) {
		try {
			if (profusionUserId != null) {
				List<Projects> data = projectService.getData(profusionUserId);
				if (data != null && data.size() > 0) {
					return new ResponseEntity<AppResponse>(new AppResponse("M200", "Fetch data successfully", data),
							HttpStatus.OK);
				} else {
					return new ResponseEntity<AppResponse>(new AppResponse("M400", "Failed to fetch data ", null),
							HttpStatus.BAD_REQUEST);
				}
			} else {
				throw new Exception("Null value not acceptable");
			}

		} catch (Exception e) {
			log.error("Exception occured due to ", e);
		}
		return new ResponseEntity<AppResponse>(new AppResponse("M400", "Failed to fetch data ", null),
				HttpStatus.BAD_REQUEST);

	}

	@DeleteMapping("/discard-project-data")
	public ResponseEntity<AppResponse> discardProjectData(@RequestParam Integer proId) {
		try {
			log.info("Discarding the project data against project Id::" + proId);
			if (proId != null && proId > 0) {
				projectService.deleteByID(proId);
				return new ResponseEntity<AppResponse>(new AppResponse("M200", "Successfully discarded", proId),
						HttpStatus.OK);
			} else {
				throw new NullPointerException();
			}

		} catch (Exception e) {
			log.error("Exception occured due to ", e);
		}
		return new ResponseEntity<AppResponse>(new AppResponse("M400", "Failed to discard", null), HttpStatus.OK);

	}

	@PutMapping("/update-data")
	public ResponseEntity<AppResponse> updateData(@RequestBody Projects projects) {
		try {
			log.info("Updating the project details against the project ID::" + projects.getProId());
			if (projects != null) {
				Projects updateData = projectService.updateData(projects);
				if (updateData != null) {
					return new ResponseEntity<AppResponse>(
							new AppResponse("M200", "Successfully updated the data", updateData), HttpStatus.OK);

				}
			}

		} catch (Exception e) {
			log.error("Exception occured due to ", e);
		}
		return new ResponseEntity<AppResponse>(new AppResponse("M400", "Failed to update", null), HttpStatus.OK);

	}

}
