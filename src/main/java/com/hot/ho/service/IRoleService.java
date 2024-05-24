package com.hot.ho.service;

import com.hot.ho.model.Role;
import com.hot.ho.model.User;

import java.util.List;

/**
 * @author Simpson Alfred
 */

public interface IRoleService {
    List<Role> getRoles();
    Role createRole(Role theRole);

    void deleteRole(Long id);
    Role findByName(String name);

    User removeUserFromRole(Long userId, Long roleId);
    User assignRoleToUser(Long userId, Long roleId);
    Role removeAllUsersFromRole(Long roleId);
}
