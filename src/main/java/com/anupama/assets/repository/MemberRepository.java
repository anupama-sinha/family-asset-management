package com.anupama.assets.repository;

import com.anupama.assets.models.Members;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MemberRepository extends /*PagingAndSortingRepository*/JpaRepository<Members, Long>{

}