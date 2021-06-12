package cn.yswu.entity;

/**
 * @author yswu
 * @date 2021-06-12 16:14
 */
public class UserDTO {

    private User user;
    private Role role;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    @Override
    public String toString() {
        return "UserDTO{" +
                "user=" + user +
                ", role=" + role +
                '}';
    }
}
