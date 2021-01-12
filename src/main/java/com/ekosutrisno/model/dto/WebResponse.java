package com.ekosutrisno.model.dto;

import java.util.List;

/**
 * The type Web response.
 *
 * @author Eko Sutrisno Tuesday, 12/01/2021 12:23
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

    /**
     * Gets api version.
     *
     * @return the api version
     */
    public String getApiVersion() {
        return apiVersion;
    }

    /**
     * Sets api version.
     *
     * @param apiVersion the api version
     */
    public void setApiVersion(String apiVersion) {
        this.apiVersion = apiVersion;
    }

    /**
     * Gets organization.
     *
     * @return the organization
     */
    public String getOrganization() {
        return organization;
    }

    /**
     * Sets organization.
     *
     * @param organization the organization
     */
    public void setOrganization(String organization) {
        this.organization = organization;
    }

    /**
     * Gets status code.
     *
     * @return the status code
     */
    public Integer getStatusCode() {
        return statusCode;
    }

    /**
     * Sets status code.
     *
     * @param statusCode the status code
     */
    public void setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
    }

    /**
     * Gets data.
     *
     * @return the data
     */
    public List<ResponseOrder> getData() {
        return data;
    }

    /**
     * Sets data.
     *
     * @param data the data
     */
    public void setData(List<ResponseOrder> data) {
        this.data = data;
    }

    /**
     * Gets item per page.
     *
     * @return the item per page
     */
    public Integer getItemPerPage() {
        return itemPerPage;
    }

    /**
     * Sets item per page.
     *
     * @param itemPerPage the item per page
     */
    public void setItemPerPage(Integer itemPerPage) {
        this.itemPerPage = itemPerPage;
    }

    /**
     * Gets total items.
     *
     * @return the total items
     */
    public Long getTotalItems() {
        return totalItems;
    }

    /**
     * Sets total items.
     *
     * @param totalItems the total items
     */
    public void setTotalItems(Long totalItems) {
        this.totalItems = totalItems;
    }

    /**
     * Gets page index.
     *
     * @return the page index
     */
    public Long getPageIndex() {
        return pageIndex;
    }

    /**
     * Sets page index.
     *
     * @param pageIndex the page index
     */
    public void setPageIndex(Long pageIndex) {
        this.pageIndex = pageIndex;
    }

    /**
     * Gets total pages.
     *
     * @return the total pages
     */
    public Integer getTotalPages() {
        return totalPages;
    }

    /**
     * Sets total pages.
     *
     * @param totalPages the total pages
     */
    public void setTotalPages(Integer totalPages) {
        this.totalPages = totalPages;
    }
}
