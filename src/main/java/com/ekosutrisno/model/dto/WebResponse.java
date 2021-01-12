package com.ekosutrisno.model.dto;

import java.util.List;

/**
 * @author Eko Sutrisno
 * Tuesday, 12/01/2021 12:23
 */
public class WebResponse {
    private String apiVersion;
    private String organization;
    private Integer statusCode;
    private List<ResponseOrder> data;
    private Integer itemPerPage;
    private Long totalItems;
    private Long pageIndex;
    private Integer totalPages;

    public String getApiVersion() {
        return apiVersion;
    }

    public void setApiVersion(String apiVersion) {
        this.apiVersion = apiVersion;
    }

    public String getOrganization() {
        return organization;
    }

    public void setOrganization(String organization) {
        this.organization = organization;
    }

    public Integer getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
    }

    public List<ResponseOrder> getData() {
        return data;
    }

    public void setData(List<ResponseOrder> data) {
        this.data = data;
    }

    public Integer getItemPerPage() {
        return itemPerPage;
    }

    public void setItemPerPage(Integer itemPerPage) {
        this.itemPerPage = itemPerPage;
    }

    public Long getTotalItems() {
        return totalItems;
    }

    public void setTotalItems(Long totalItems) {
        this.totalItems = totalItems;
    }

    public Long getPageIndex() {
        return pageIndex;
    }

    public void setPageIndex(Long pageIndex) {
        this.pageIndex = pageIndex;
    }

    public Integer getTotalPages() {
        return totalPages;
    }

    public void setTotalPages(Integer totalPages) {
        this.totalPages = totalPages;
    }
}
