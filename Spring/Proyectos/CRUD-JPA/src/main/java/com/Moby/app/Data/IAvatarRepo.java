package com.Moby.app.Data;

import com.Moby.app.Model.Avatar;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IAvatarRepo extends JpaRepository<Avatar, Integer>{
    
}
