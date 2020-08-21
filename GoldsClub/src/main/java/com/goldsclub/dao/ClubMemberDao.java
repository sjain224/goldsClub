package com.goldsclub.dao;

import com.goldsclub.domain.ClubMember;

import java.util.List;

public interface ClubMemberDao {
public void addClubMember(ClubMember cm);
public List<ClubMember> getAllClubMembers();
public boolean deleteClubMember(Integer id);
}
