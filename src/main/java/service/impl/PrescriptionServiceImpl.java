package service.impl;

import dto.PrescriptionDTO;
import repository.PerscriptionRepo;
import repository.PrescriptionRepoImpl;
import service.PrescriptionService;

import java.util.ArrayList;

/**
 * Created by Maheshwar Muttal on 3/5/2017.
 */
public class PrescriptionServiceImpl implements PrescriptionService {

    PerscriptionRepo perscriptionRepo = new PrescriptionRepoImpl();


    public int save(PrescriptionDTO prescriptionDTO) {
        int size= perscriptionRepo.addPrescription(prescriptionDTO);
        return size;
    }

    public int getTotalPrescription() {

        return perscriptionRepo.getTotalPrescription();
    }
}
