package tesTechnicalSALT.ServBackEnd;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping
public class ServiceControllerBE {

    private final ServiceCostumer serviceCostumer;

    @Autowired
     public ServiceControllerBE(ServiceCostumer serviceCostumer){
        this.serviceCostumer = serviceCostumer;
     }

    @GetMapping( "/customer")
    public String dataCustomerview(Model model){
        model.addAttribute("customer", serviceCostumer.getUserData());
        return "customer";
    }
}
