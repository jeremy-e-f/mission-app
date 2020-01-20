package dev.mission.exec;

import java.math.BigDecimal;
import java.time.LocalDate;
import org.springframework.stereotype.Controller;
import dev.mission.entite.Mission;
import dev.mission.repository.MissionRepository;

public class InsererMission implements Runnable {
	private MissionRepository missionRepository;

	public InsererMission(MissionRepository missionRepository) {
		super();
		this.missionRepository = missionRepository;
	}

	@Override
	public void run() {
		Mission mission = new Mission();
		mission.setLibelle("Mission 2");
		mission.setTauxJournalier(new BigDecimal("85.28"));
		mission.setDateDebut(LocalDate.of(2019, 1, 2));
		mission.setDateFin(LocalDate.of(2019, 5, 9));
		this.missionRepository.save(mission);
	}
}
