package za.ac.cput.Service.Implementation;



import za.ac.cput.Domain.System.Charge;
import za.ac.cput.Repository.System.ChargeRepository;
import za.ac.cput.Repository.Implementation.System.ChargeRepositoryImplementation;
import za.ac.cput.Service.System.ChargeService;

import java.util.Set;

public class ChargeServiceImplementation implements ChargeService{

    private static ChargeServiceImplementation chargeServiceImplementation = null;
    private ChargeRepository chargeRepository;

    private ChargeServiceImplementation(){
        this.chargeRepository = ChargeRepositoryImplementation.getRepository();
    }

    public static ChargeServiceImplementation getRepository(){
        if(chargeServiceImplementation == null)chargeServiceImplementation = new ChargeServiceImplementation();
        return chargeServiceImplementation;
    }

    @Override
    public Charge create(Charge charge) { return this.chargeRepository.create(charge);    }

    @Override
    public Charge read(String n) {
        return this.chargeRepository.read(n);
    }

    @Override
    public Charge update(Charge charge) {
        return this.chargeRepository.update(charge);
    }

    @Override
    public void delete(String n) { this.chargeRepository.delete(n);}

    public Set<Charge> getChargeSet() {
        return this.chargeRepository.getChargeSet();
    }
}
