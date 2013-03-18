for (var i = $units.length - 1; i >= 0; i--) {
    var u = $units[i];
    //debug("in units configure ", u)
    if ('pollen_configure' in u) {
        u.pollen_configure();
    }
    if (u.pollen$used && 'pollen__uses__' in u) {
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
    if (u.pollen$used) {
        if ('$$hostInit' in u) {
            u.$$hostInit();
        }
        if ('pollen_generateCode' in u) {
            u.$$code = u.pollen_generateCode(u.$name.replace(/\./g, '_') + '_');
        }
    }
}
