package com.Moby.app.Service;

import java.util.List;

import com.Moby.app.Model.Avatar;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Transactional
@Repository
public interface AvatarService {
    public int Insert(Avatar a);
    public boolean Delete(int id);
    public boolean Modify(Avatar a);
    public Avatar Consult(int id);
    public List<Avatar> GetAll();
}
