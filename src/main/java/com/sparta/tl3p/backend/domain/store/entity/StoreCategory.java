package com.sparta.tl3p.backend.domain.store.entity;

import com.sparta.tl3p.backend.common.audit.BaseEntity;
import com.sparta.tl3p.backend.domain.store.enums.CategoryType;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Entity
@Getter
@NoArgsConstructor
@Table(name = "p_store_category")
public class StoreCategory extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "store_category_id", columnDefinition = "uuid")
    private UUID id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "store_id", nullable = false)
    private Store store;

    @Enumerated(EnumType.STRING)
    @Column(name = "category_id", length = 20, nullable = false)
    private CategoryType category;

    public StoreCategory(Store store, CategoryType category) {
        this.store = store;
        this.category = category;
    }
}
