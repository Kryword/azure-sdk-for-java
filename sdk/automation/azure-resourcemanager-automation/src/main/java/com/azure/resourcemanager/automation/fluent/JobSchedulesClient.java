// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.automation.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;
import com.azure.resourcemanager.automation.fluent.models.JobScheduleInner;
import com.azure.resourcemanager.automation.models.JobScheduleCreateParameters;
import java.util.UUID;

/** An instance of this class provides access to all the operations defined in JobSchedulesClient. */
public interface JobSchedulesClient {
    /**
     * Delete the job schedule identified by job schedule name.
     *
     * @param resourceGroupName Name of an Azure Resource group.
     * @param automationAccountName The name of the automation account.
     * @param jobScheduleId The job schedule name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String automationAccountName, UUID jobScheduleId);

    /**
     * Delete the job schedule identified by job schedule name.
     *
     * @param resourceGroupName Name of an Azure Resource group.
     * @param automationAccountName The name of the automation account.
     * @param jobScheduleId The job schedule name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<Void> deleteWithResponse(
        String resourceGroupName, String automationAccountName, UUID jobScheduleId, Context context);

    /**
     * Retrieve the job schedule identified by job schedule name.
     *
     * @param resourceGroupName Name of an Azure Resource group.
     * @param automationAccountName The name of the automation account.
     * @param jobScheduleId The job schedule name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return definition of the job schedule.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    JobScheduleInner get(String resourceGroupName, String automationAccountName, UUID jobScheduleId);

    /**
     * Retrieve the job schedule identified by job schedule name.
     *
     * @param resourceGroupName Name of an Azure Resource group.
     * @param automationAccountName The name of the automation account.
     * @param jobScheduleId The job schedule name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return definition of the job schedule.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<JobScheduleInner> getWithResponse(
        String resourceGroupName, String automationAccountName, UUID jobScheduleId, Context context);

    /**
     * Create a job schedule.
     *
     * @param resourceGroupName Name of an Azure Resource group.
     * @param automationAccountName The name of the automation account.
     * @param jobScheduleId The job schedule name.
     * @param parameters The parameters supplied to the create job schedule operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return definition of the job schedule.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    JobScheduleInner create(
        String resourceGroupName,
        String automationAccountName,
        UUID jobScheduleId,
        JobScheduleCreateParameters parameters);

    /**
     * Create a job schedule.
     *
     * @param resourceGroupName Name of an Azure Resource group.
     * @param automationAccountName The name of the automation account.
     * @param jobScheduleId The job schedule name.
     * @param parameters The parameters supplied to the create job schedule operation.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return definition of the job schedule.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<JobScheduleInner> createWithResponse(
        String resourceGroupName,
        String automationAccountName,
        UUID jobScheduleId,
        JobScheduleCreateParameters parameters,
        Context context);

    /**
     * Retrieve a list of job schedules.
     *
     * @param resourceGroupName Name of an Azure Resource group.
     * @param automationAccountName The name of the automation account.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response model for the list job schedule operation.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<JobScheduleInner> listByAutomationAccount(String resourceGroupName, String automationAccountName);

    /**
     * Retrieve a list of job schedules.
     *
     * @param resourceGroupName Name of an Azure Resource group.
     * @param automationAccountName The name of the automation account.
     * @param filter The filter to apply on the operation.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response model for the list job schedule operation.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<JobScheduleInner> listByAutomationAccount(
        String resourceGroupName, String automationAccountName, String filter, Context context);
}