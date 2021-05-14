package dev.davidwright.appointmentmanager.models;
import java.time.LocalDateTime;
public class Appointment {
    private int id;
    private String title;
    private String description;
    private String location;
    private int contactId;
    private String type;
    private LocalDateTime startDate;
    private LocalDateTime endDate;
    private int customerId;
    private int userId;
    private LocalDateTime create_date;
    private int createdBy;

    public Appointment(int id, String title, String description, String location,
                       int contactId, String type, LocalDateTime startDate, LocalDateTime endDate,
                       int customerId, int userId, int createdBy) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.location = location;
        this.contactId = contactId;
        this.type = type;
        this.startDate = startDate;
        this.endDate = endDate;
        this.customerId = customerId;
        this.userId = userId;
        this.createdBy = createdBy;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public String getLocation() {
        return location;
    }

    public int getContactId() {
        return contactId;
    }

    public String getType() {
        return type;
    }

    public LocalDateTime getStartDate() {
        return startDate;
    }

    public LocalDateTime getEndDate() {
        return endDate;
    }

    public int getCustomerId() {
        return customerId;
    }

    public int getUserId() {
        return userId;
    }

    public LocalDateTime getCreate_date() {
        return create_date;
    }

    public int getCreatedBy() {
        return createdBy;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void setContactId(int contactId) {
        this.contactId = contactId;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setStartDate(LocalDateTime startDate) {
        this.startDate = startDate;
    }

    public void setEndDate(LocalDateTime endDate) {
        this.endDate = endDate;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public void setCreate_date(LocalDateTime create_date) {
        this.create_date = create_date;
    }

    public void setCreatedBy(int createdBy) {
        this.createdBy = createdBy;
    }
}
