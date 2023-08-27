package tesTechnicalSALT.ServBackEnd;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServiceCostumer {

    private final CustomerReposit customerReposit;

    @Autowired
    public ServiceCostumer(CustomerReposit customerReposit) {
        this.customerReposit = customerReposit;
    }

    public List<UserData> getUserData(){
        return customerReposit.findAll();
    }

}

