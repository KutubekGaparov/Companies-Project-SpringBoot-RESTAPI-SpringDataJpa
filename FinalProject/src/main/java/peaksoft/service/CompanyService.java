package peaksoft.service;

import peaksoft.dto.request.CompanyRequest;
import peaksoft.model.Company;
import peaksoft.dto.response.Response;
import java.util.List;

public interface CompanyService {

    Response saveCompany(CompanyRequest company);

    Response deleteById(Long id);

    Company getById(Long id);

    List<Company> findAllCompany();

    Response updateById(Long id, CompanyRequest company);
}
