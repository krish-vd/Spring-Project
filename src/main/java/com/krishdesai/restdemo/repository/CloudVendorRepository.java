package com.krishdesai.restdemo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

import com.krishdesai.restdemo.model.CloudVendor;

public interface CloudVendorRepository extends JpaRepository<CloudVendor, String> {
    List<CloudVendor> findByVendorName(String vendorName);
}
