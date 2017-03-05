package service;

import dto.PrescriptionDTO;

import java.util.ArrayList;

/**
 * Created by Maheshwar Muttal on 3/5/2017.
 */
public interface PrescriptionService {
    int save(PrescriptionDTO prescriptionDTO);

    int getTotalPrescription();
}
