for (var i = $units.length - 1; i >= 0; i--) {
    var u = $units[i];
    debug_line("in units configure ", u)
    if ('pollen_configure' in u) {
        u.pollen_configure();
    }
    if (u.pollen$used && 'pollen__uses__' in u) {
        debug_line("...in units configure, calling pollen__uses__ ", u)
        u.pollen__uses__();
    }
}

for (var i = $units.length - 1; i >= 0; i--) {
    var u = $units[i];
    if ('$$privateInit' in u) {
        u.$$privateInit();
    }
}

for (var i = $units.length - 1; i >= 0; i--) {
    var u = $units[i];
    if ('$$hostInit' in u) {
        debug_line("...in units configure, calling $$hostInit", u)
        u.$$hostInit();
    }
    if (u.pollen$used) {
        if ('pollen_generateCode' in u) {
            u.$$code = u.pollen_generateCode(u.$name.replace(/\./g, '_') + '_');
        }
    }
}
