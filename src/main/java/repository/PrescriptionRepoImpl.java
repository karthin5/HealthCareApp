package repository;

import dto.PrescriptionDTO;

import java.util.ArrayList;

/**
 * Created by Maheshwar Muttal on 3/5/2017.
 */
public class PrescriptionRepoImpl implements PerscriptionRepo {

    static ArrayList prescriptionList = new ArrayList();

    public int addPrescription(PrescriptionDTO prescriptionDTO) {
        prescriptionList.add(prescriptionDTO);
        return prescriptionList.size();
    }

    public int getTotalPrescription() {

        return prescriptionList.size();
    }
}
