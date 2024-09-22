// src/app/api/get-filters/route.ts
import { promises as fs } from 'fs';

export async function GET() {
    const filters = await fs.readFile('src/data/facets.json', 'utf-8');
    return new Response(filters, {
        status: 200,
        headers: {
            'Content-Type': 'application/json',
        },
    });
}
