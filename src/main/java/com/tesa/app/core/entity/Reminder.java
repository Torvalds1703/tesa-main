package com.tesa.app.core.entity;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Data
@Builder
@Entity
@Table(name = "reminders")
@AllArgsConstructor
@RequiredArgsConstructor
public class Reminder {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long reminderId;

    @Column(nullable = false)
    private LocalDateTime remindAt;

    @Column(nullable = false)
    private String method;

    @ManyToOne
    @JoinColumn(name = "task_id")
    private Task task;

}
