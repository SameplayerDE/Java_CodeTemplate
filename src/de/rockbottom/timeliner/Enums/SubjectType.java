package de.rockbottom.timeliner.Enums;

/** Dies ist eine Auflistung
 * @author Oktay
 * @version 1.5
 * @since 1.0
 */

public enum SubjectType {

    GERMAN("Deutsch"),
    ENGLISH("Englisch"),
    MATH("Mathematik");

    private String subjectName;

    SubjectType(String subjectName) {
        this.subjectName = subjectName;
    }


    /** Rückgabefunktion für Fachnamen
     *
     * @return Der Name des Faches
     */
    public String getSubjectName() {
        return subjectName;
    }

}
