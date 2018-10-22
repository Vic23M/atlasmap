package io.atlasmap.core;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.Test;

import io.atlasmap.api.AtlasException;
import io.atlasmap.spi.AtlasInternalSession;
import io.atlasmap.spi.AtlasInternalSession.Head;
import io.atlasmap.v2.FieldType;
import io.atlasmap.v2.MockField;
import io.atlasmap.v2.PropertyField;

public class PropertyModuleTest {
    private static PropertyModule module = new PropertyModule(new DefaultAtlasPropertyStrategy());

    @Test
    public void testDestroy() {
        module.destroy();
    }

    @Test
    public void testProcessPreValidation() throws AtlasException {
        module.processPreValidation(null);
    }

    @Test
    public void testProcessPreSourceExecution() throws AtlasException {
        module.processPreSourceExecution(null);
    }

    @Test
    public void testProcessSourceFieldMapping() throws AtlasException {
        PropertyField field = mock(PropertyField.class);
        when(field.getValue()).thenReturn("fieldValue");

        Head head = mock(Head.class);
        when(head.getSourceField()).thenReturn(field);

        AtlasInternalSession session = mock(AtlasInternalSession.class);
        when(session.head()).thenReturn(head);

        DefaultAtlasConversionService atlasConversionService = mock(DefaultAtlasConversionService.class);
        when(atlasConversionService.fieldTypeFromClass(any(String.class))).thenReturn(FieldType.ANY);

        module.setConversionService(atlasConversionService);
        module.readSourceValue(session);
    }

    @Test
    public void testProcessPostSourceExecution() throws AtlasException {
        module.processPostSourceExecution(null);
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testProcessPreTargetExecution() throws AtlasException {
        module.processPreTargetExecution(null);
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testProcessTargetFieldMapping() throws AtlasException {
        module.writeTargetValue(null);
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testProcessPostTargetExecution() throws AtlasException {
        module.processPostTargetExecution(null);
    }

    @Test
    public void testProcessPostValidation() throws AtlasException {
        module.processPostValidation(null);
    }

    @Test
    public void testGetMode() {
        assertNotNull(module.getMode());
    }

    @Test
    public void testGetConversionService() {
        assertNotNull(module.getConversionService());
    }

    @Test
    public void testListSupportedModes() {
        assertNotNull(module.listSupportedModes());
    }

    @Test
    public void testGetDocId() {
        assertNull(module.getDocId());
    }

    @Test
    public void testGetUri() {
        assertNull(module.getUri());
    }

    @Test
    public void testIsStatisticsSupported() {
        assertFalse(module.isStatisticsSupported());
    }

    @Test
    public void testIsStatisticsEnabled() {
        assertFalse(module.isStatisticsEnabled());
    }

    @Test
    public void testIsSupportedField() {
        assertFalse(module.isSupportedField(new MockField()));
    }

    @Test
    public void testCloneField() throws AtlasException {
        assertNull(module.cloneField(new MockField()));
    }

    @Test
    public void testGetFieldActionService() {
        assertNull(module.getFieldActionService());
    }

    @Test
    public void testInit() {
        module.init();
    }

    @Test
    public void testSetDocId() {
        module.setDocId(null);
    }

    @Test
    public void testSetUri() {
        module.setUri(null);
    }

}
