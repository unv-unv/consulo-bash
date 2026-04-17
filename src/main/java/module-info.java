/**
 * @author VISTALL
 * @since 11.05.2024
 */
open module consulo.bash {
    requires consulo.ide.api;

    requires consulo.application.api;
    requires consulo.application.content.api;
    requires consulo.code.editor.api;
    requires consulo.color.scheme.api;
    requires consulo.component.api;
    requires consulo.configurable.api;
    requires consulo.datacontext.api;
    requires consulo.disposer.api;
    requires consulo.document.api;
    requires consulo.execution.api;
    requires consulo.execution.impl;
    requires consulo.file.editor.api;
    requires consulo.file.template.api;
    requires consulo.index.io;
    requires consulo.language.api;
    requires consulo.language.impl;
    requires consulo.language.editor.api;
    requires consulo.language.editor.refactoring.api;
    requires consulo.language.code.style.api;
    requires consulo.localize.api;
    requires consulo.logging.api;
    requires consulo.module.api;
    requires consulo.module.content.api;
    requires consulo.module.ui.api;
    requires consulo.navigation.api;
    requires consulo.platform.api;
    requires consulo.process.api;
    requires consulo.project.api;
    requires consulo.ui.api;
    requires consulo.ui.ex.api;
    requires consulo.ui.ex.awt.api;
    requires consulo.virtual.file.system.api;
    requires consulo.util.collection;
    requires consulo.util.dataholder;
    requires consulo.util.io;
    requires consulo.util.lang;
    requires consulo.util.xml.serializer;

    // TODO remove in future
    requires forms.rt;
    requires java.desktop;
}