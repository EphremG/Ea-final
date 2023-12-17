package edu.miu.cs.cs544.dto;

import edu.miu.cs.cs544.domain.AuditData;
import edu.miu.cs.cs544.domain.Item;
import edu.miu.cs.cs544.domain.ReservationState;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.List;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ReservationDto {

    private Integer id;

    private Integer customerId;

    private LocalDate reservationDate;

    private ReservationState state;

    private List<Item> itemIds;

    private AuditData auditData;
//    private Integer productId;



//        private Integer id;
//
//        private Integer customerId;
//
//        private LocalDate reservationDate;
//
//        private ReservationState state;
//
//        private List<Item> itemIds;
//
//        private AuditData auditData;
//
//        public static class Item {
//            private Integer id;
//            private Integer occupants;
//            private LocalDate checkinDate;
//            private LocalDate checkoutDate;
//            private Double rate;
//            private Integer unit;
//            private Product product; // Add this line
//        }
//
//        public static class Product {
//            private Integer id;
//            private String name;
//            private String description;
//            private String excerpt;
//            private Double rate;
//            private Integer maxCapacity;
//            private String type;
//            private boolean isAvailable;
//        }


}