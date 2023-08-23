package com.example.appresource.entity;

import jakarta.persistence.*;
import lombok.*;

import java.sql.Date;

@Entity
@Table(name = "resource")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString

public class Resource {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "filename", nullable = false)
    private String filename;

    @Column(name = "filepath", nullable = false)
    private String filepath;

    @Column(name = "file_format",nullable = false)
    private String file_format;

    @Column(name = "date_upload", nullable = false)
    private Date date_upload;

    @Column(name = "date_open", nullable = false)
    private Date date_open;

    @Column(name = "owner", nullable = false)
    private long owner;

    @Column(name = "file_size", nullable = false)
    private long file_size;

    @Column(name = "permit", nullable = false)
    private String permit;

    @Column(name = "file")
    private byte[] file;

}
