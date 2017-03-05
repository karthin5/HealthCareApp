package Repo;

import dto.PrescriptionDTO;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mock;
import repository.PerscriptionRepo;
import repository.PrescriptionRepoImpl;

import java.util.Date;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

/**
 * Created by Maheshwar Muttal on 3/5/2017.
 */
public class AddPrescriptionRepoTest  {

    @Mock
    PerscriptionRepo perscriptionRepo = mock(PrescriptionRepoImpl.class);


    @Test
    public void saveFirstPrescriptionTest(){
        PrescriptionDTO prescriptionDTO =createPrescription("Mahesh", "Priya", "Fever");
        when(perscriptionRepo.addPrescription(prescriptionDTO)).thenReturn(1);

    }

    public static PrescriptionDTO createPrescription(String  patientName, String doctorName, String illness) {
        PrescriptionDTO prescriptionDTO = new PrescriptionDTO();
        prescriptionDTO.setName(patientName);
        prescriptionDTO.setDoctorName(doctorName);
        prescriptionDTO.setCreationDate(new Date());
        prescriptionDTO.setIllness(illness);
        prescriptionDTO.setDescription("abc");
        prescriptionDTO.setMedicineName("xyz");
        return prescriptionDTO;
    }
}
