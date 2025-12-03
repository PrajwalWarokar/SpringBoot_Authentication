package in.prajwalWarokar.authify.service;

import in.prajwalWarokar.authify.io.ProfileRequest;
import in.prajwalWarokar.authify.io.ProfileResponse;

public interface ProfileService {

   ProfileResponse  createProfile(ProfileRequest request);
}
