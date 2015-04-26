#include <stddef.h>
#include <stdint.h>
#include <stdbool.h>

/* common prologue */

// not needed in c99
// typedef _Bool           bool;
typedef char            byte;
typedef const char*     string;

typedef int8_t		int8;
typedef int16_t		int16;
typedef int32_t		int32;

typedef uint8_t		uint8;
typedef uint16_t	uint16;
typedef uint32_t	uint32;

typedef void*           voidPtr;

/* common epilogue */

typedef struct __ArrDesc__ {
    voidPtr elems;
    uint16 length;
} __ArrDesc__;

#define __arrDescSet__(buf,arr,Type) ((buf.elems = arr), (buf.length = sizeof (arr) / sizeof Type), buf)

#undef true
#define true 1

#undef false
#define false 0

#undef null
#define null 0

#ifndef pollen__const_decl
#define pollen__const_decl(var) \

#endif

void __done();
void __fail();
void __halt();
void __run();
