package com.blog.shiro.realm;

import com.blog.pojo.User;
import com.blog.service.UserService;
import com.blog.shiro.BlogUsernamePasswordToken;
import com.blog.utils.CommonUtil;
import org.apache.shiro.authc.*;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.apache.shiro.util.ByteSource;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class UserRealm extends AuthorizingRealm {

    @Autowired
    private UserService userService;

    @Override
    public String getName() {
        return "user";
    }

    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection) {
        return null;
    }

    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authenticationToken) throws AuthenticationException {
        BlogUsernamePasswordToken token= (BlogUsernamePasswordToken) authenticationToken;
        List<User> users = userService.selectUserByusername(token.getUsername());
        if (users.size() != 0){
            User user = users.get(0);
            System.out.println(user);
            return new SimpleAuthenticationInfo(user.getUsername(),user.getPassword(), ByteSource.Util.bytes(CommonUtil.SALT),this.getName());
        }else {
            throw new UnknownAccountException("用户不存在");
        }
    }
}
