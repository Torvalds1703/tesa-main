package com.tesa.app.core.entity;

import jakarta.persistence.*;
import lombok.*;

@Data
@Builder
@Entity
@Table(name = "task_assignees")
@AllArgsConstructor
@RequiredArgsConstructor
public class TaskAssignee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long taskAssigneeId;

    @ManyToOne
    @JoinColumn(name = "task_id")
    private Task task;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

}