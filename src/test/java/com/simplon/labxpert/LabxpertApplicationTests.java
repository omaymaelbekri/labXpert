package com.simplon.labxpert;

import com.simplon.labxpert.Repository.*;
import com.simplon.labxpert.model.*;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Date;

@SpringBootTest
class LabxpertApplicationTests implements CommandLineRunner {

	@Autowired
	private PatientRepository patientRepository;

	@Autowired
	private EchantillonRepository echantillonRepository;

	@Autowired
	private UserRepository userRepository;

	@Autowired
	private PlannificationRepository plannificationRepository;

	@Autowired
	private ReactifRepository reactifRepository;

	@Autowired
	private AnalyseRepository analyseRepository;

	@Autowired
	private ResultatRepository resultatRepository;

	@Autowired
	private TestRepository testRepository;

	@Test
	void contextLoads() {
		// Testez le chargement du contexte Spring
	}

	@Override
	public void run(String... args) throws Exception {
		// Création d'un objet Patient et sauvegarde dans la base de données
		Patient patient = new Patient();
		patient.setNom("NomPatient");
		patient.setPrénom("PrenomPatient");
		patient.setDatenaissance(new Date());
		patient.setSexe("Homme");
		patient.setAdresse("AdressePatient");
		patient.setTelephone("0123456789");
		patientRepository.save(patient);

		// Création d'un objet Echantillon et sauvegarde dans la base de données
		Echantillon echantillon = new Echantillon();
		echantillon.setPatient(patient);
		echantillon.setDateprelevement(new Date());
		echantillonRepository.save(echantillon);

		// Création d'un objet User et sauvegarde dans la base de données
		User user = new User();
		user.setNomUtilisateur("nomUtilisateur");
		userRepository.save(user);

		// Création d'un objet Plannification et sauvegarde dans la base de données
		Plannification plannification = new Plannification();
		plannificationRepository.save(plannification);

		// Création d'un objet Reactif et sauvegarde dans la base de données
		Reactif reactif1 = new Reactif();
		reactifRepository.save(reactif1);

		// Création d'un objet Analyse et sauvegarde dans la base de données
		Analyse analyse = new Analyse();
		analyse.setId(1);
		analyse.setDateDebut(new Date());
		analyse.setDateFin(new Date());
		analyse.setEchantillon(echantillon);
		analyse.setUser(user);
		analyse.setPlannification(plannification);
		analyseRepository.save(analyse);

		// Création d'un objet Resultat et sauvegarde dans la base de données
		Resultat resultat = new Resultat();
		resultat.setTestAnalyse(testRepository.findById(1).orElse(null)); // Assurez-vous d'avoir un test avec l'ID 1 dans la base de données
		resultat.setValeurResultat(25.5);
		resultat.setUnite("mg/dL");
		resultat.setStatut(Resultat.Statut.NORMAL);
		resultatRepository.save(resultat);

		// Création d'un objet Test et sauvegarde dans la base de données
		Test_analyse test = new Test_analyse();
		test.setMin(10);
		test.setMax(20);
		test.setResultat(resultat);
		testRepository.save(test);
	}
}

