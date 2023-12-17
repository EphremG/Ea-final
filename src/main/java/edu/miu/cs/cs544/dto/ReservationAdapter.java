package edu.miu.cs.cs544.dto;

import edu.miu.cs.cs544.domain.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class ReservationAdapter {
    public static ReservationDto getReservationDto(Reservation reservation) {
        return new ReservationDto(reservation.getId(), reservation.getCustomer().getId(),
                reservation.getReservationDate(), reservation.getState(),
                reservation.getItems(),reservation.getAuditData());
    }

    public static Reservation getReservation(ReservationDto reservationDto) {
        return new Reservation(reservationDto.getId(), null,reservationDto.getReservationDate(),
                reservationDto.getState(), reservationDto.getItemIds(),reservationDto.getAuditData());
    }

//public class ReservationAdapter {
//    public static ReservationDto getReservationDto(Reservation reservation) {
//        ReservationDto dto = new ReservationDto();
//        dto.setId(reservation.getId());
//        dto.setCustomerId(reservation.getCustomer().getId());
//        dto.setReservationDate(reservation.getReservationDate());
//        dto.setState(reservation.getState());
//        dto.setAuditData(reservation.getAuditData());
//
//        List<ReservationDto.Item> itemDtos = new ArrayList<>();
//        for (Item item : reservation.getItems()) {
//            ReservationDto.Item itemDto = new ReservationDto.Item();
//            itemDto.setId(item.getId());
//            itemDto.setOccupants(item.getOccupants());
//            itemDto.setCheckinDate(item.getCheckinDate());
//            itemDto.setCheckoutDate(item.getCheckoutDate());
//            itemDto.setRate(item.getRate());
//            itemDto.setUnit(item.getUnit());
//            ReservationDto.Product productDto = new ReservationDto.Product();
//            productDto.setId(item.getProduct().getId());
//            productDto.setName(item.getProduct().getName());
//            productDto.setDescription(item.getProduct().getDescription());
//            productDto.setExcerpt(item.getProduct().getExcerpt());
//            productDto.setRate(item.getProduct().getRate());
//            productDto.setMaxCapacity(item.getProduct().getMaxCapacity());
//            productDto.setType(item.getProduct().getType().toString());
//            productDto.setIsAvailable(item.getProduct().isAvailable());
//            itemDto.setProduct(productDto); // Add this line
//            itemDtos.add(itemDto);
//        }
//        dto.setItemIds(itemDtos);
//
//        return dto;
//    }
//}

//    public static Reservation getReservation(ReservationDto reservationDto) {
//        Reservation reservation = new Reservation();
//        reservation.setId(reservationDto.getId());
//        // Set other fields of Reservation from ReservationDto...
//
//        List<Item> items = new ArrayList<>();
//        for (ReservationDto.Item itemDto : reservationDto.getItemIds()) {
//            Item item = new Item();
//            item.setId(itemDto.getId());
//            // Set other fields of Item from ItemDto...
//
//            Product product = new Product();
//            product.setId(itemDto.getProduct().getId());
//            // Set other fields of Product from ProductDto...
//
//            item.setProduct(product);
//            items.add(item);
//        }
//        reservation.setItems(items);
//
//        return reservation;
//    }
}
