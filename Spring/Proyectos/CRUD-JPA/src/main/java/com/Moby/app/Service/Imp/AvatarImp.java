package com.Moby.app.Service.Imp;

import java.util.List;

import com.Moby.app.Data.IAvatarRepo;
import com.Moby.app.Model.Avatar;
import com.Moby.app.Service.AvatarService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AvatarImp implements AvatarService{

    @Autowired
    private IAvatarRepo iAvatarRepo;

    @Override
    public int Insert(Avatar a) {
        return 0;
    }

    @Override
    public boolean Delete(int id) {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public boolean Modify(Avatar a) {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public Avatar Consult(int id) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public List<Avatar> GetAll() {
        // TODO Auto-generated method stub
        return null;
    }
    
}
