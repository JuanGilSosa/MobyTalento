package com.Moby.app.Controller;

import com.Moby.app.Model.Avatar;
import com.Moby.app.Service.AvatarService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AvatarController {
    @Autowired
    AvatarService avatarService;

    public void CreateAvatar(){
        Avatar a = new Avatar();
        avatarService.Insert(a);
    }
    public void ConsultAvatar(){
        Avatar a = avatarService.Consult(1);
    }
    public void DeleteAvatar(){
        Avatar a  = new Avatar();
        avatarService.Delete(a.getId());
    }
    public void ModifyAvatar(){
        Avatar a = new Avatar();
        avatarService.Modify(a);
    }
}
