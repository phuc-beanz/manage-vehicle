package vn.com.devmaster.services.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import vn.com.devmaster.services.domain.User;
import vn.com.devmaster.services.domain.Vehicle;
import vn.com.devmaster.services.repository.UserRepository;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class VehicleService {
    private final UserRepository userRepository;

}
