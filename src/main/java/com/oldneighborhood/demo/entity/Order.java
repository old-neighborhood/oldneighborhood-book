package com.oldneighborhood.demo.entity;

import java.sql.Timestamp;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="order")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@RequiredArgsConstructor
@Data
@Builder
public class Order {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private String o_ID;
	@NonNull
	private String o_name;
	@NonNull
	private String g_ID;
	@NonNull
	private String u_ID;
	@NonNull
	private int o_amount;
	@NonNull
	private double o_price;
	@NonNull
	private Date o_fromDate;
	@NonNull
	private Date o_toDate;
	@Column(columnDefinition="timestamp not null default now()" , updatable=false)
	private Timestamp o_date;
	
}
