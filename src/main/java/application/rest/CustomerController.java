package application.rest;

import application.domain.Customer;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author dimarzio
 */
@RestController("/")
public class CustomerController {

    @RequestMapping("/customer")
    @PreAuthorize("hasRole('ROLE_ADMIN')")
    public Customer customer() {
        return new Customer("Joe", "Black", 30);
    }
}
