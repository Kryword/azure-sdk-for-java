// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.resourcemover.models;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;

/** Resource collection API of MoveCollections. */
public interface MoveCollections {
    /**
     * Deletes a move collection.
     *
     * @param resourceGroupName The Resource Group Name.
     * @param moveCollectionName The Move Collection Name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return operation status REST resource.
     */
    OperationStatus deleteByResourceGroup(String resourceGroupName, String moveCollectionName);

    /**
     * Deletes a move collection.
     *
     * @param resourceGroupName The Resource Group Name.
     * @param moveCollectionName The Move Collection Name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return operation status REST resource.
     */
    OperationStatus delete(String resourceGroupName, String moveCollectionName, Context context);

    /**
     * Gets the move collection.
     *
     * @param resourceGroupName The Resource Group Name.
     * @param moveCollectionName The Move Collection Name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the move collection.
     */
    MoveCollection getByResourceGroup(String resourceGroupName, String moveCollectionName);

    /**
     * Gets the move collection.
     *
     * @param resourceGroupName The Resource Group Name.
     * @param moveCollectionName The Move Collection Name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the move collection.
     */
    Response<MoveCollection> getByResourceGroupWithResponse(
        String resourceGroupName, String moveCollectionName, Context context);

    /**
     * Initiates prepare for the set of resources included in the request body. The prepare operation is on the
     * moveResources that are in the moveState 'PreparePending' or 'PrepareFailed', on a successful completion the
     * moveResource moveState do a transition to MovePending. To aid the user to prerequisite the operation the client
     * can call operation with validateOnly property set to true.
     *
     * @param resourceGroupName The Resource Group Name.
     * @param moveCollectionName The Move Collection Name.
     * @param body Defines the request body for initiate prepare operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return operation status REST resource.
     */
    OperationStatus prepare(String resourceGroupName, String moveCollectionName, PrepareRequest body);

    /**
     * Initiates prepare for the set of resources included in the request body. The prepare operation is on the
     * moveResources that are in the moveState 'PreparePending' or 'PrepareFailed', on a successful completion the
     * moveResource moveState do a transition to MovePending. To aid the user to prerequisite the operation the client
     * can call operation with validateOnly property set to true.
     *
     * @param resourceGroupName The Resource Group Name.
     * @param moveCollectionName The Move Collection Name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return operation status REST resource.
     */
    OperationStatus prepare(String resourceGroupName, String moveCollectionName);

    /**
     * Initiates prepare for the set of resources included in the request body. The prepare operation is on the
     * moveResources that are in the moveState 'PreparePending' or 'PrepareFailed', on a successful completion the
     * moveResource moveState do a transition to MovePending. To aid the user to prerequisite the operation the client
     * can call operation with validateOnly property set to true.
     *
     * @param resourceGroupName The Resource Group Name.
     * @param moveCollectionName The Move Collection Name.
     * @param body Defines the request body for initiate prepare operation.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return operation status REST resource.
     */
    OperationStatus prepare(String resourceGroupName, String moveCollectionName, PrepareRequest body, Context context);

    /**
     * Moves the set of resources included in the request body. The move operation is triggered after the moveResources
     * are in the moveState 'MovePending' or 'MoveFailed', on a successful completion the moveResource moveState do a
     * transition to CommitPending. To aid the user to prerequisite the operation the client can call operation with
     * validateOnly property set to true.
     *
     * @param resourceGroupName The Resource Group Name.
     * @param moveCollectionName The Move Collection Name.
     * @param body Defines the request body for resource move operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return operation status REST resource.
     */
    OperationStatus initiateMove(String resourceGroupName, String moveCollectionName, ResourceMoveRequest body);

    /**
     * Moves the set of resources included in the request body. The move operation is triggered after the moveResources
     * are in the moveState 'MovePending' or 'MoveFailed', on a successful completion the moveResource moveState do a
     * transition to CommitPending. To aid the user to prerequisite the operation the client can call operation with
     * validateOnly property set to true.
     *
     * @param resourceGroupName The Resource Group Name.
     * @param moveCollectionName The Move Collection Name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return operation status REST resource.
     */
    OperationStatus initiateMove(String resourceGroupName, String moveCollectionName);

    /**
     * Moves the set of resources included in the request body. The move operation is triggered after the moveResources
     * are in the moveState 'MovePending' or 'MoveFailed', on a successful completion the moveResource moveState do a
     * transition to CommitPending. To aid the user to prerequisite the operation the client can call operation with
     * validateOnly property set to true.
     *
     * @param resourceGroupName The Resource Group Name.
     * @param moveCollectionName The Move Collection Name.
     * @param body Defines the request body for resource move operation.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return operation status REST resource.
     */
    OperationStatus initiateMove(
        String resourceGroupName, String moveCollectionName, ResourceMoveRequest body, Context context);

    /**
     * Commits the set of resources included in the request body. The commit operation is triggered on the moveResources
     * in the moveState 'CommitPending' or 'CommitFailed', on a successful completion the moveResource moveState do a
     * transition to Committed. To aid the user to prerequisite the operation the client can call operation with
     * validateOnly property set to true.
     *
     * @param resourceGroupName The Resource Group Name.
     * @param moveCollectionName The Move Collection Name.
     * @param body Defines the request body for commit operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return operation status REST resource.
     */
    OperationStatus commit(String resourceGroupName, String moveCollectionName, CommitRequest body);

    /**
     * Commits the set of resources included in the request body. The commit operation is triggered on the moveResources
     * in the moveState 'CommitPending' or 'CommitFailed', on a successful completion the moveResource moveState do a
     * transition to Committed. To aid the user to prerequisite the operation the client can call operation with
     * validateOnly property set to true.
     *
     * @param resourceGroupName The Resource Group Name.
     * @param moveCollectionName The Move Collection Name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return operation status REST resource.
     */
    OperationStatus commit(String resourceGroupName, String moveCollectionName);

    /**
     * Commits the set of resources included in the request body. The commit operation is triggered on the moveResources
     * in the moveState 'CommitPending' or 'CommitFailed', on a successful completion the moveResource moveState do a
     * transition to Committed. To aid the user to prerequisite the operation the client can call operation with
     * validateOnly property set to true.
     *
     * @param resourceGroupName The Resource Group Name.
     * @param moveCollectionName The Move Collection Name.
     * @param body Defines the request body for commit operation.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return operation status REST resource.
     */
    OperationStatus commit(String resourceGroupName, String moveCollectionName, CommitRequest body, Context context);

    /**
     * Discards the set of resources included in the request body. The discard operation is triggered on the
     * moveResources in the moveState 'CommitPending' or 'DiscardFailed', on a successful completion the moveResource
     * moveState do a transition to MovePending. To aid the user to prerequisite the operation the client can call
     * operation with validateOnly property set to true.
     *
     * @param resourceGroupName The Resource Group Name.
     * @param moveCollectionName The Move Collection Name.
     * @param body Defines the request body for discard operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return operation status REST resource.
     */
    OperationStatus discard(String resourceGroupName, String moveCollectionName, DiscardRequest body);

    /**
     * Discards the set of resources included in the request body. The discard operation is triggered on the
     * moveResources in the moveState 'CommitPending' or 'DiscardFailed', on a successful completion the moveResource
     * moveState do a transition to MovePending. To aid the user to prerequisite the operation the client can call
     * operation with validateOnly property set to true.
     *
     * @param resourceGroupName The Resource Group Name.
     * @param moveCollectionName The Move Collection Name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return operation status REST resource.
     */
    OperationStatus discard(String resourceGroupName, String moveCollectionName);

    /**
     * Discards the set of resources included in the request body. The discard operation is triggered on the
     * moveResources in the moveState 'CommitPending' or 'DiscardFailed', on a successful completion the moveResource
     * moveState do a transition to MovePending. To aid the user to prerequisite the operation the client can call
     * operation with validateOnly property set to true.
     *
     * @param resourceGroupName The Resource Group Name.
     * @param moveCollectionName The Move Collection Name.
     * @param body Defines the request body for discard operation.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return operation status REST resource.
     */
    OperationStatus discard(String resourceGroupName, String moveCollectionName, DiscardRequest body, Context context);

    /**
     * Computes, resolves and validate the dependencies of the moveResources in the move collection.
     *
     * @param resourceGroupName The Resource Group Name.
     * @param moveCollectionName The Move Collection Name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return operation status REST resource.
     */
    OperationStatus resolveDependencies(String resourceGroupName, String moveCollectionName);

    /**
     * Computes, resolves and validate the dependencies of the moveResources in the move collection.
     *
     * @param resourceGroupName The Resource Group Name.
     * @param moveCollectionName The Move Collection Name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return operation status REST resource.
     */
    OperationStatus resolveDependencies(String resourceGroupName, String moveCollectionName, Context context);

    /**
     * Removes the set of move resources included in the request body from move collection. The orchestration is done by
     * service. To aid the user to prerequisite the operation the client can call operation with validateOnly property
     * set to true.
     *
     * @param resourceGroupName The resourceGroupName parameter.
     * @param moveCollectionName The moveCollectionName parameter.
     * @param body Defines the request body for bulk remove of move resources operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return operation status REST resource.
     */
    OperationStatus bulkRemove(String resourceGroupName, String moveCollectionName, BulkRemoveRequest body);

    /**
     * Removes the set of move resources included in the request body from move collection. The orchestration is done by
     * service. To aid the user to prerequisite the operation the client can call operation with validateOnly property
     * set to true.
     *
     * @param resourceGroupName The resourceGroupName parameter.
     * @param moveCollectionName The moveCollectionName parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return operation status REST resource.
     */
    OperationStatus bulkRemove(String resourceGroupName, String moveCollectionName);

    /**
     * Removes the set of move resources included in the request body from move collection. The orchestration is done by
     * service. To aid the user to prerequisite the operation the client can call operation with validateOnly property
     * set to true.
     *
     * @param resourceGroupName The resourceGroupName parameter.
     * @param moveCollectionName The moveCollectionName parameter.
     * @param body Defines the request body for bulk remove of move resources operation.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return operation status REST resource.
     */
    OperationStatus bulkRemove(
        String resourceGroupName, String moveCollectionName, BulkRemoveRequest body, Context context);

    /**
     * Get all the Move Collections in the subscription.
     *
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all the Move Collections in the subscription.
     */
    PagedIterable<MoveCollection> list();

    /**
     * Get all the Move Collections in the subscription.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all the Move Collections in the subscription.
     */
    PagedIterable<MoveCollection> list(Context context);

    /**
     * Get all the Move Collections in the resource group.
     *
     * @param resourceGroupName The Resource Group Name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all the Move Collections in the resource group.
     */
    PagedIterable<MoveCollection> listByResourceGroup(String resourceGroupName);

    /**
     * Get all the Move Collections in the resource group.
     *
     * @param resourceGroupName The Resource Group Name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all the Move Collections in the resource group.
     */
    PagedIterable<MoveCollection> listByResourceGroup(String resourceGroupName, Context context);

    /**
     * List of the move resources for which an arm resource is required for.
     *
     * @param resourceGroupName The Resource Group Name.
     * @param moveCollectionName The Move Collection Name.
     * @param sourceId The sourceId for which the api is invoked.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return required for resources collection.
     */
    RequiredForResourcesCollection listRequiredFor(
        String resourceGroupName, String moveCollectionName, String sourceId);

    /**
     * List of the move resources for which an arm resource is required for.
     *
     * @param resourceGroupName The Resource Group Name.
     * @param moveCollectionName The Move Collection Name.
     * @param sourceId The sourceId for which the api is invoked.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return required for resources collection.
     */
    Response<RequiredForResourcesCollection> listRequiredForWithResponse(
        String resourceGroupName, String moveCollectionName, String sourceId, Context context);

    /**
     * Gets the move collection.
     *
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the move collection.
     */
    MoveCollection getById(String id);

    /**
     * Gets the move collection.
     *
     * @param id the resource ID.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the move collection.
     */
    Response<MoveCollection> getByIdWithResponse(String id, Context context);

    /**
     * Deletes a move collection.
     *
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return operation status REST resource.
     */
    OperationStatus deleteById(String id);

    /**
     * Deletes a move collection.
     *
     * @param id the resource ID.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return operation status REST resource.
     */
    OperationStatus deleteByIdWithResponse(String id, Context context);

    /**
     * Begins definition for a new MoveCollection resource.
     *
     * @param name resource name.
     * @return the first stage of the new MoveCollection definition.
     */
    MoveCollection.DefinitionStages.Blank define(String name);
}