package com.vetapp.msuser.infrastructure.adapter.mapper;

import java.util.UUID;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;

import com.vetapp.msuser.domain.model.User;
import com.vetapp.msuser.infrastructure.adapter.entity.UserEntity;

@Mapper(componentModel = "spring",
        unmappedSourcePolicy = ReportingPolicy.IGNORE,
        unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface IUserMapper {

    UserEntity toEntity(User user);
    User toUser(UserEntity userEntity);

}
