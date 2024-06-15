package mg.scuderia.car_show.repository;

import mg.scuderia.car_show.model.auth.Role;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RoleRepository extends GenericRepository<Role, Integer> {
    List<Role> findByRoleId(Long roleId);
}