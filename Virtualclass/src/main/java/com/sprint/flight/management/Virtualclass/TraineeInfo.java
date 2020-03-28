package com.sprint.flight.management.Virtualclass;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;


@Component("trainee")
public class TraineeInfo {

	 @Value("${trainee.Id}")
	  private int traineeId;
	  @Value("${trainee.Name}")
	  private String traineeName;
	  @Value("${trainee.Technology}")
	  private String technology;
	  @Autowired
	  private TrainerInfo trainer;
	public int getTraineeId() {
		return traineeId;
	}
	public void setTraineeId(int traineeId) {
		this.traineeId = traineeId;
	}
	public String getTraineeName() {
		return traineeName;
	}
	public void setTraineeName(String traineeName) {
		this.traineeName = traineeName;
	}
	public String getTechnology() {
		return technology;
	}
	public void setTechnology(String technology) {
		this.technology = technology;
	}
	public TrainerInfo getTrainer() {
		return trainer;
	}
	public void setTrainer(TrainerInfo trainer) {
		this.trainer = trainer;
	}
 
	public void display()
	{
		System.out.println("Trainee Details ");
		System.out.println("-------------------------------------------------");
		System.out.println("Trainee ID          : "+traineeId);
		System.out.println("Trainee Name        : "+traineeName);
		System.out.println("Trainee Technology  : "+technology);
		System.out.println("Trainee Trainer     : "+trainer.getTrainerName());
		System.out.println("Trainee Trainer     : "+trainer.getExpertise());
		
	}
}
