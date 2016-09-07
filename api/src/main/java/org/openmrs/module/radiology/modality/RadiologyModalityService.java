/**
 * This Source Code Form is subject to the terms of the Mozilla Public License,
 * v. 2.0. If a copy of the MPL was not distributed with this file, You can
 * obtain one at http://mozilla.org/MPL/2.0/. OpenMRS is also distributed under
 * the terms of the Healthcare Disclaimer located at http://openmrs.org/license.
 *
 * Copyright (C) OpenMRS Inc. OpenMRS is a registered trademark and the OpenMRS
 * graphic logo is a trademark of OpenMRS Inc.
 */
package org.openmrs.module.radiology.modality;

import org.openmrs.annotation.Authorized;
import org.openmrs.api.APIException;
import org.openmrs.api.OpenmrsService;
import org.openmrs.module.radiology.RadiologyPrivileges;

/**
 * Service layer for {@code RadiologyModality}.
 *
 * @see RadiologyModality
 */
public interface RadiologyModalityService extends OpenmrsService {
    
    
    /**
     * Saves a new {@code RadiologyModality}.
     *
     * @param radiologyModality the radiology modality to be saved
     * @return the saved radiology modality
     * @throws IllegalArgumentException if radiologyModality is null
     * @throws IllegalArgumentException if radiologyModality id is not null
     * @throws APIException if radiologyModality is not valid
     * @should throw illegal argument exception if given radiology modality is null
     * @should throw illegal argument exception if given radiology modality with non null id
     * @should throw api exception if radiology modality is not valid
     */
    @Authorized(RadiologyPrivileges.ADD_RADIOLOGY_MODALITIES)
    public RadiologyModality saveRadiologyModality(RadiologyModality radiologyModality);
    
    /**
     * Get the {@code RadiologyModality} by its {@code id}.
     *
     * @param id the modality id of the wanted radiology modality
     * @return the radiology modality matching given id
     * @throws IllegalArgumentException if given null
     * @should return radiology modality matching given id
     * @should return null if no match was found
     * @should throw illegal argument exception if given null
     */
    @Authorized(RadiologyPrivileges.GET_RADIOLOGY_MODALITIES)
    public RadiologyModality getRadiologyModality(Integer id);
    
    /**
     * Get the {@code RadiologyModality} by its {@code UUID}.
     *
     * @param uuid the uuid of the radiology modality
     * @return the radiology modality matching given uuid
     * @throws IllegalArgumentException if given null
     * @should return radiology modality matching given uuid
     * @should return null if no match was found
     * @should throw illegal argument exception if given null
     */
    @Authorized(RadiologyPrivileges.GET_RADIOLOGY_MODALITIES)
    public RadiologyModality getRadiologyModalityByUuid(String uuid);
}
