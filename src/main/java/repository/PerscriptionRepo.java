package repository;

import dto.PrescriptionDTO;

import java.util.ArrayList;

/**
 * Created by Maheshwar Muttal on 3/5/2017.
 */
public interface PerscriptionRepo {
     public int addPrescription(PrescriptionDTO prescriptionDTO);

     public int getTotalPrescription();


}
