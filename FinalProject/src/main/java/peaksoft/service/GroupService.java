package peaksoft.service;

import peaksoft.dto.request.GroupRequest;
import peaksoft.model.Group;
import peaksoft.dto.response.Response;

import java.time.LocalDate;
import java.util.List;

public interface GroupService {

    Response saveGroup(GroupRequest group, Long id);

    Response deleteById(Long id);

    Group getById(Long id);

    List<Group> findAllGroup();

    Response updateById(Long id, GroupRequest group);

    List<Group> getByDates(LocalDate dateOfStart, LocalDate dateOfFinish);

}
