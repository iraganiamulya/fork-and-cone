package com.example.entities;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
public class AuditLog {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String entityType;
    private Long entityId;
    private String action;
    private LocalDateTime timestamp;

    public AuditLog() {}

    public AuditLog(String entityType, Long entityId, String action, LocalDateTime timestamp) {
        this.entityType = entityType;
        this.entityId = entityId;
        this.action = action;
        this.timestamp = timestamp;
    }

    public Long getId() { return id; }
    public String getEntityType() { return entityType; }
    public void setEntityType(String entityType) { this.entityType = entityType; }
    public Long getEntityId() { return entityId; }
    public void setEntityId(Long entityId) { this.entityId = entityId; }
    public String getAction() { return action; }
    public void setAction(String action) { this.action = action; }
    public LocalDateTime getTimestamp() { return timestamp; }
    public void setTimestamp(LocalDateTime timestamp) { this.timestamp = timestamp; }
}
