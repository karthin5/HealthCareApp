package service;

import dto.PrescriptionDTO;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;
import repository.PerscriptionRepo;
import repository.PrescriptionRepoImpl;
import service.impl.PrescriptionServiceImpl;

import java.util.Date;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class AddPrescriptionTest {
    @InjectMocks
    PrescriptionService service = new PrescriptionServiceImpl();

    @Mock
    PerscriptionRepo perscriptionRepo = mock(PrescriptionRepoImpl.class);


    @Test
    public void saveFirstPrescriptionTest(){
         PrescriptionDTO prescriptionDTO =createPrescription("Mahesh", "Priya", "Fever");

        when(perscriptionRepo.addPrescription(prescriptionDTO)).thenReturn(1);
        Assert.assertEquals(1, service.save(prescriptionDTO));
    }

    @Test
    public void saveSecondPrescriptionTest(){

        PrescriptionDTO prescriptionDTO = createPrescription("Avinash", "Priya", "Fever");

        when(perscriptionRepo.addPrescription(prescriptionDTO)).thenReturn(2);
        Assert.assertEquals(2, service.save(prescriptionDTO));
    }

    @Test
    public void getAllPrescriptionTest() {
        when(perscriptionRepo.getTotalPrescription()).thenReturn(3);
        Assert.assertEquals(3, service.getTotalPrescription());
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
