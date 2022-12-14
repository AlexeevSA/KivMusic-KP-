package com.alexeev.kivmusic.service.impl;

import com.alexeev.kivmusic.models.DeliveryEntity;
import com.alexeev.kivmusic.repository.DeliveryRepository;
import com.alexeev.kivmusic.service.DeliveryService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DeliveryServiceImpl implements DeliveryService {

    private final DeliveryRepository deliveryRepository;

    public DeliveryServiceImpl(DeliveryRepository deliveryRepository) {
        this.deliveryRepository = deliveryRepository;
    }

    @Override
    public List<DeliveryEntity> findAllDelivery() {
        return deliveryRepository.findAll();
    }

    @Override
    public Optional<DeliveryEntity> findById(Long id) {
        return deliveryRepository.findById(id);
    }

    @Override
    public DeliveryEntity saveDelivery(DeliveryEntity delivery) {
        return deliveryRepository.save(delivery);
    }

    @Override
    public DeliveryEntity updateDelivery(DeliveryEntity delivery) {
        return deliveryRepository.save(delivery);
    }

    @Override
    public void deleteDelivery(Long id) {
        deliveryRepository.deleteById(id);
    }
}
