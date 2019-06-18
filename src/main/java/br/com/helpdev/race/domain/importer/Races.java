package br.com.helpdev.race.domain.importer;

import br.com.helpdev.race.domain.race.Race;

import java.time.LocalDate;
import java.util.Collections;
import java.util.List;

public class Races {

    public static Races getRaces(List<Race> races, LocalDate localDate) {
        return new Races(Collections.unmodifiableList(races), localDate);
    }

    private List<Race> races;
    private LocalDate localDate;

    private Races(List<Race> races, LocalDate localDate) {
        this.races = races;
        this.localDate = localDate;
    }

    public List<Race> getRaces() {
        return races;
    }

    public LocalDate getLocalDate() {
        return localDate;
    }
}
