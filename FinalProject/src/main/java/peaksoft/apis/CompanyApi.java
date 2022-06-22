package peaksoft.apis;

import io.swagger.v3.oas.annotations.Operation;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import peaksoft.dto.request.CompanyRequest;
import peaksoft.model.Company;
import peaksoft.dto.response.Response;
import peaksoft.service.CompanyService;
import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/api/company")
public class CompanyApi {

    private final CompanyService service;

    @Operation(summary = "Zhanarbek",description = "Kutubek")
    @GetMapping("/getAll")
    public List<Company> getAllCompany() {
        return service.findAllCompany();
    }

    @GetMapping("/getById/{id}")
    public Company getById(@PathVariable("id") Long id) {
        return (service.getById(id));
    }

    @PostMapping("/save")
    public Response saveCompany(@RequestBody CompanyRequest company) {
        return service.saveCompany(company);
    }

    @PatchMapping("/update/{id}")
    public Response update(@RequestBody CompanyRequest company,
                           @PathVariable("id") Long id) {
        return service.updateById(id, company);
    }

    @DeleteMapping("/delete/{id}")
    public Response delete(@PathVariable("id") Long id) {
       return service.deleteById(id);
    }
}
